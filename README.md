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
🔗 [LinkedIn](https://www.linkedin.com/)  
📧 eliezer@email.com
