
# language: pt

Funcionalidade: Cadastro de usuário

  Cenário: Cadastrar novo usuário com sucesso
    Dado que estou na página de cadastro
    Quando preencho todos os campos obrigatórios
    E clico no botão Registrar
    Então o cadastro deve ser realizado com sucesso
