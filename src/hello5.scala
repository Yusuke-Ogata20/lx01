/*
 * 関数を宣言し、利用する例。
 * この例はhelloという名前の関数を宣言しています。
 * main関数のなかでhelloは二回呼ばれます。
 */

object Hello5 {
  def hello(role: String, professor: String): Unit = {
    println(role + "担当は" + professor + "です。")
  }

  def main(args: Array[String]): Unit = {
    hello("講義", "脇田 建（わきた けん）")
    hello("演習", "叢 悠悠（そう ゆうゆう）")
  }
}
