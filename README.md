# currency_converter

O objetivo foi consumir uma API externa gratuita que devolvesse valores de cotação de moedas para realizar
uma prova de conceito do funcionamento, pois, utilizando uma API paga, seria possível abranger mais moedas.

A API escolhida nesta prova foi a [AwesomeAPI](https://docs.awesomeapi.com.br/api-de-moedas), por ser gratuita e permitir fazer mais requisições. Porém, esta tem um escopo mais reduzido de opções de moeda e não inclui a moeda INR.
Num segundo momento, eu utilizaria o serviço da [XE Currency Data](https://www.xe.com/pt/xecurrencydata?channel=roadrunner-ucc-2x2SlotTwo) que me forneceria todas as moedas, porém, é uma API paga.

A estratégia escolhida foi criar um gateway dentro da minha aplicação, chamando a Awesome API, acessando o payload recebido, que tem o seguinte formato:

`{`
`    "USD": {`
`        "code": "USD",`
 `       "codein": "BRL",`
`        "name": "Dólar Comercial",`
`       "high": "5.3023",`
`        "low": "5.2139",`
`        "varBid": "-0.07",`
`       "pctChange": "-1.32",`
`        "bid": "5.2284",`
`       "ask": "5.2297",`
`       "timestamp": "1610642934",`
`        "create_date": "2021-01-14 13:48:56"`
`    }`
`}`

De todas estas informações, preciso salvar o bid, que vai servir para realizar o meu calculo de conversão.

Agora, quando a minha API de currency converter for chamada, devo receber duas informações do client no body: o valor do produto e as moedas de cotação desejadas.

Vou salvar estes dois dados em variáveis distintas, usar o valor de bid para multiplicar pelo valor do produto e salvar novamente na variável. Depois do calculo feito, eu posso salvar os resultados num hashmap(por ser um tipo dinamico)para ser manipulado depois pelo front, onde eu teria o nome da moeda e o valor calculado da cotação.

Até o momento, faltou apontar a URL do Awesome API dentro do meu serviço, de trabalhar na função do AwesomeAPIService que faria este calculo e concluir o DTO que formataria a resposta com os key-value para o payload com os valores calculados da cotação com base no preço do produto.

#### Próximos passos
Uma feature que poderia ser incluida futuramente neste serviço é criar um gateway para o microserviço [nearby_locations](https://github.com/Jeefelix/nearby_locations),onde, eu usaria a chamada de geolocalização do cliente para duas coisas:
 1 - Através da geolocalização, ordenar os preços no conversor de moedas. Assim, ele visualizaria ordenado o valor de moeda do seu país primeiro na lista;
 2 - Permitiria a opção de "retire na loja", tendo mais uma opção além de entrega por transportadora ou correio.
