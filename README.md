# 💱 Conversor de Moedas com Java + ExchangeRate API

Este é um projeto de portfólio desenvolvido em Java que simula um conversor de moedas entre diversas moedas da América Latina e o dólar americano. Ele utiliza a [ExchangeRate API](https://www.exchangerate-api.com/) para obter as taxas de câmbio em tempo real.

---

## 🛠️ Tecnologias Utilizadas

- Java 21
- `HttpClient` (nativo do Java para requisições HTTP)
- GSON (para parsear JSON)
- API ExchangeRate
- Scanner (entrada do usuário via terminal)

---

## 🎯 Funcionalidades

- Conversão entre as seguintes moedas:
    - Dólar americano (USD)
    - Peso argentino (ARS)
    - Real brasileiro (BRL)
    - Peso colombiano (COP)

- Menu interativo no terminal
- Leitura de valor via teclado
- Exibição clara do valor convertido
- Uso de chamadas HTTP com tratamento de resposta da API

---

## 📸 Demonstração

```
****************************************
Seja bem-vindo/a ao Conversor de Moeda =]
1) Dólar => Peso argentino
2) Peso argentino => Dólar
3) Dólar => Real brasileiro
4) Real brasileiro => Dólar
5) Dólar => Peso colombiano
6) Peso colombiano => Dólar
7) Sair
Escolha uma opção válida:
****************************************
```

---

## 🚀 Como Executar

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/conversor-moedas-java.git
cd conversor-moedas-java
```

### 2. Configure a sua chave da ExchangeRate API

- Acesse: [https://www.exchangerate-api.com](https://www.exchangerate-api.com/)
- Crie uma conta gratuita
- Copie sua chave da API
- Altere a constante `API_KEY` no arquivo `CurrencyConverter.java`:

```java
private static final String API_KEY = "SUA_CHAVE_AQUI";
```

### 3. Compile e execute com o terminal

```bash
javac -cp ".;lib/gson-2.10.1.jar" com/alura/conversormoeda/*.java
java -cp ".;lib/gson-2.10.1.jar" com.alura.conversormoeda.ConversorApp
```

> 💡 Certifique-se de ter a biblioteca GSON no diretório `lib/`.

---

## 📂 Estrutura do Projeto

```
conversor-moedas-java/
│
├── com/
│   └── alura/
│       └── conversormoeda/
│           ├── ConversorApp.java
│           ├── dto/
│           │   └── ExchangeResponse.java
│           └── service/
│               └── CurrencyConverter.java
│
├── lib/
│   └── gson-2.10.1.jar
└── README.md
```

---

## 🧠 Aprendizados

Este projeto foi uma oportunidade de praticar:

- Consumo de APIs REST com Java
- Manipulação de JSON com GSON
- Estruturação de projeto com pacotes
- Boas práticas com `record` para DTOs
- Entrada e saída no terminal com `Scanner`
- Programação orientada a objetos

---

## 🌍 Moedas Suportadas

Este conversor suporta **161 moedas** com base na ExchangeRate API.

### Lista de Moedas Suportadas
AED - Dirham dos Emirados Árabes Unidos  
AFN - Afegane Afegão  
ALL - Lek Albanês  
AMD - Dram Armênio  
ANG - Florim das Antilhas Holandesas  
AOA - Kwanza Angolano  
ARS - Peso Argentino  
AUD - Dólar Australiano  
AWG - Florim de Aruba  
AZN - Manat Azerbaijano  
BAM - Marco Conversível da Bósnia e Herzegovina  
BBD - Dólar de Barbados  
BDT - Taka de Bangladesh  
BGN - Lev Búlgaro  
BHD - Dinar do Bahrein  
BIF - Franco Burundiano  
BMD - Dólar das Bermudas  
BND - Dólar de Brunei  
BOB - Boliviano  
BRL - Real Brasileiro  
BSD - Dólar das Bahamas  
BTN - Ngultrum Butanês  
BWP - Pula de Botswana  
BYN - Rublo Bielorrusso  
BZD - Dólar de Belize  
CAD - Dólar Canadense  
CDF - Franco Congolês  
CHF - Franco Suíço  
CLP - Peso Chileno  
CNY - Yuan Chinês  
COP - Peso Colombiano  
CRC - Colón Costarriquenho  
CUP - Peso Cubano  
CVE - Escudo Cabo-verdiano  
CZK - Coroa Tcheca  
DJF - Franco do Djibouti  
DKK - Coroa Dinamarquesa  
DOP - Peso Dominicano  
DZD - Dinar Argelino  
EGP - Libra Egípcia  
ERN - Nakfa da Eritreia  
ETB - Birr Etíope  
EUR - Euro  
FJD - Dólar de Fiji  
FKP - Libra das Ilhas Falkland  
FOK - Coroa das Ilhas Faroe  
GBP - Libra Esterlina  
GEL - Lari Georgiano  
GGP - Libra de Guernsey  
GHS - Cedi Ganês  
GIP - Libra de Gibraltar  
GMD - Dalasi da Gâmbia  
GNF - Franco Guineense  
GTQ - Quetzal Guatemalteco  
GYD - Dólar da Guiana  
HKD - Dólar de Hong Kong  
HNL - Lempira Hondurenha  
HRK - Kuna Croata  
HTG - Gourde Haitiano  
HUF - Forint Húngaro  
IDR - Rupia Indonésia  
ILS - Novo Shekel Israelense  
IMP - Libra da Ilha de Man  
INR - Rupia Indiana  
IQD - Dinar Iraquiano  
IRR - Rial Iraniano  
ISK - Coroa Islandesa  
JEP - Libra de Jersey  
JMD - Dólar Jamaicano  
JOD - Dinar Jordaniano  
JPY - Iene Japonês  
KES - Xelim Queniano  
KGS - Som Quirguiz  
KHR - Riel Cambojano  
KID - Dólar de Kiribati  
KMF - Franco Comorense  
KRW - Won Sul-coreano  
KWD - Dinar Kuwaitiano  
KYD - Dólar das Ilhas Cayman  
KZT - Tenge Cazaque  
LAK - Kip Laosiano  
LBP - Libra Libanesa  
LKR - Rupia do Sri Lanka  
LRD - Dólar Liberiano  
LSL - Loti do Lesoto  
LYD - Dinar Líbio  
MAD - Dirham Marroquino  
MDL - Leu Moldavo  
MGA - Ariary Malgaxe  
MKD - Dinar Macedônio  
MMK - Kyat Birmanês  
MNT - Tugrik Mongol  
MOP - Pataca de Macau  
MRU - Ouguiya Mauritana  
MUR - Rupia Mauriciana  
MVR - Rufiyaa Maldiva  
MWK - Kwacha Malauiano  
MXN - Peso Mexicano  
MYR - Ringgit Malaio  
MZN - Metical Moçambicano  
NAD - Dólar Namibiano  
NGN - Naira Nigeriana  
NIO - Córdoba Nicaraguense  
NOK - Coroa Norueguesa  
NPR - Rupia Nepalesa  
NZD - Dólar Neozelandês  
OMR - Rial Omanense  
PAB - Balboa Panamenho  
PEN - Sol Peruano  
PGK - Kina Papua-Nova Guiné  
PHP - Peso Filipino  
PKR - Rupia Paquistanesa  
PLN - Zloty Polonês  
PYG - Guarani Paraguaio  
QAR - Rial Catariano  
RON - Leu Romeno  
RSD - Dinar Sérvio  
RUB - Rublo Russo  
RWF - Franco Ruandês  
SAR - Rial Saudita  
SBD - Dólar das Ilhas Salomão  
SCR - Rupia de Seychelles  
SDG - Libra Sudanesa  
SEK - Coroa Sueca  
SGD - Dólar de Singapura  
SHP - Libra de Santa Helena  
SLE - Leone de Serra Leoa  
SLL - Leone de Serra Leoa (antigo)  
SOS - Xelim Somali  
SRD - Dólar do Suriname  
SSP - Libra Sul-sudanesa  
STN - Dobra São-tomense  
SYP - Libra Síria  
SZL - Lilangeni Suazi  
THB - Baht Tailandês  
TJS - Somoni Tadjique  
TMT - Manat Turcomeno  
TND - Dinar Tunisiano  
TOP - Paʻanga Tonganês  
TRY - Lira Turca  
TTD - Dólar de Trinidad e Tobago  
TVD - Dólar das Ilhas Tuvalu  
TWD - Novo Dólar Taiwanês  
TZS - Xelim Tanzaniano  
UAH - Hryvnia Ucraniana  
UGX - Xelim Ugandense  
USD - Dólar Americano  
UYU - Peso Uruguaio  
UZS - Som Uzbeque  
VES - Bolívar Venezuelano  
VND - Dong Vietnamita  
VUV - Vatu de Vanuatu  
WST - Tala Samoano  
XAF - Franco CFA Central  
XCD - Dólar do Caribe Oriental  
XDR - Direitos Especiais de Saque  
XOF - Franco CFA Ocidental  
XPF - Franco CFP  
YER - Rial Iemenita  
ZAR - Rand Sul-africano  
ZMW - Kwacha Zambiano  
ZWL - Dólar Zimbabuano

---

## 📌 Próximos Passos

- [ ] Adicionar suporte a mais moedas
- [ ] Suporte a múltiplos idiomas (i18n)
- [ ] Interface gráfica com JavaFX ou Swing
- [ ] Testes automatizados (JUnit)

---

## 📃 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 🤝 Contato

Feito com 💙 por Eliezer  
🔗 [LinkedIn](https://www.linkedin.com/in/eliezer-moraes-silva-80b68010b)  
📧 eliezer.moraes@outlook.com
