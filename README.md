# Atividades Android

Cada pasta e um aplicativo. Os arquivos-chave estao organizados assim:

```
NN_NomeDoApp/
  AndroidManifest.xml       -> vai em app/src/main/
  java/*.java               -> vai em app/src/main/java/com/example/<pacote>/
  res/layout/*.xml          -> vai em app/src/main/res/layout/
```

Para usar no Android Studio: crie um projeto vazio (Empty Views Activity, Java),
apague os arquivos gerados e cole os desta pasta nos caminhos indicados.
Confira se o `package` no topo dos .java bate com o do projeto.

## Lista de aplicativos

| # | App | Descricao |
|---|-----|-----------|
| 01 | ContadorDeCliques | Conta cliques com botao de zerar |
| 02 | SorteioNumeros | Sorteia numero aleatorio entre min e max, com validacao |
| 03 | SlideShow | Navega entre imagens com botoes anterior/proximo |
| 04 | ImcUmaTela | Calcula IMC e mostra perfil na mesma tela |
| 05 | ImcDuasTelas | Envia peso/altura por Bundle e calcula na segunda tela |
| 06 | ListaViewGroups | Exemplos de LinearLayout, RelativeLayout e FrameLayout |
| 07 | SimplePaint | Desenho na tela com View, Canvas, Paint e onTouchEvent |
| 08 | Listagem | ListView com adapter personalizado (BaseAdapter) |
| 09 | BlocoDeNotas | Salva e carrega texto usando SharedPreferences |
| 10 | LocationManager | Pega latitude e longitude com LocationManager |
