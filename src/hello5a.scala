object Hello5a {
  def hello(role: String, professor: String): Unit = {
    println(s"${role}担当は${professor}です。")
  }

  def main(args: Array[String]): Unit = {
    hello("講義", "脇田 建（わきた けん）")
    hello("演習", "叢 悠悠（そう ゆうゆう）")
  }
}
