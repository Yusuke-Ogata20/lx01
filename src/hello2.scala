/*
 * extends App を用いたScalaの最小構成のプログラムの別の書き方
 * main関数の宣言を省略した形式です。
 * Appクラスのなかでmain関数が既に定義されています。
 * そのAppクラスを拡張する形で定義されたHello2オブジェクトは
 * App関数に含まれるmain関数の定義も含まれています。
 * Hello2を実行するとAppで定義されたmain関数が呼ばれます。
 * 
 * 詳しくはAppのドキュメントを参照のこと
 * https://www.scala-lang.org/api/2.9.2/scala/App.html
 */

object Hello2 extends App {
  println("プログラミング第一へようこそ！")
}
