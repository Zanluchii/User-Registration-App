# User Registration APP

Este é um aplicativo Android desenvolvido para a disciplina de Desenvolvimento Mobile (5º Semestre - ADS). O objetivo principal do projeto é o cadastro e gerenciamento de usuários utilizando persistência de dados local com a biblioteca **Room**.

## 🚀 Funcionalidades Atuais

- **Modelo de Dados (User):** Definição da entidade de usuário com campos para Nome, CPF, E-mail e Telefone.
- **Persistência com Room:** O Room é uma biblioteca de persistência que fornece uma camada de abstração sobre o SQLite, permitindo um acesso mais robusto ao banco de dados.
    - **Entity (@Entity):** Representa uma tabela no banco de dados. No projeto, a classe `User` é mapeada como uma tabela.
    - **DAO (@Dao):** *Data Access Object*. É a interface responsável por definir os métodos de acesso aos dados (como `insert`, `delete`, `query`).
    - **Database (@Database):** O ponto de entrada principal para a conexão com os dados persistidos do aplicativo.
- **Interface do Usuário:**
    - **MainActivity:** Tela principal para entrada de dados e interação inicial.
    - **ReportActivity:** Tela para exibição de relatórios e listagem de usuários.
- **Permissões:** Uso do `AndroidManifest.xml` para declarar permissões necessárias ao sistema.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** **Java** - Linguagem robusta e amplamente utilizada no desenvolvimento Android nativo.
- **Banco de Dados:** **SQLite** - Banco de dados relacional leve embutido no Android.
- **Biblioteca Room:** Facilita o gerenciamento do banco de dados, reduzindo código repetitivo e verificando consultas SQL em tempo de compilação.
- **Ferramenta de Build:** **Gradle** - Sistema de automação de compilação que gerencia dependências e o processo de build do APK.
- **IDE:** **Android Studio** - Ambiente de desenvolvimento oficial para Android.

---

## 📝 Dicas de Comandos Git (Para a Prova)

Abaixo estão os comandos essenciais que podem te ajudar durante o desenvolvimento e a entrega:

### Fluxo Básico
- `git status`: Verifica o estado dos arquivos (quais foram modificados ou ainda não foram adicionados).
- `git add .`: Adiciona todas as alterações para a área de "staging" (preparação para o commit).
- `git commit -m "mensagem descritiva"`: Salva as alterações localmente com uma mensagem.
- `git push origin main`: Envia seus commits locais para o repositório remoto (ex: GitHub).
- `git pull origin main`: Atualiza seu repositório local com as alterações do remoto.

### Repositórios Remotos
- `git remote add origin <url>`: Vincula o repositório local a um repositório remoto (ex: GitHub).
- `git remote -v`: Lista os repositórios remotos configurados e suas URLs.
- `git clone <url>`: Cria uma cópia local de um repositório que já está no servidor.
- `git remote set-url origin <url>`: Altera a URL do repositório remoto vinculado.
- `git push -u origin main`: Envia os commits e define a branch padrão para os próximos pushes.

### Ramificações (Branches)
- `git branch`: Lista as branches existentes.
- `git checkout -b nome-da-branch`: Cria uma nova branch e muda para ela.
- `git checkout nome-da-branch`: Muda para uma branch já existente.
- `git merge nome-da-branch`: Mescla as alterações de outra branch na branch atual.

### Histórico e Desfazendo Coisas
- `git log --oneline`: Mostra o histórico de commits de forma simplificada.
- `git diff`: Mostra as alterações exatas feitas nos arquivos que ainda não foram adicionadas.
- `git restore nome-do-arquivo`: Descarta as mudanças feitas em um arquivo (cuidado!).

### Configuração de Usuário
- `git config --global user.name "Seu Nome"`: Define o nome do usuário globalmente.
- `git config --global user.email "seuemail@exemplo.com"`: Define o e-mail do usuário globalmente.
- `git config user.name`: Verifica o nome de usuário atual.
- `git config user.email`: Verifica o e-mail atual.

---
*Dica: Lembre-se sempre de fazer commits pequenos e frequentes com mensagens que expliquem o que foi feito.*
