object Hello6 extends App {
  val instructors = List("脇田 建（わきた けん）", "叢 悠悠（そう ゆうゆう）")

  var instr = 0

  def hello(role: String): Unit = {
    assert(instr < instructors.length)
    println(s"${role}担当は${instructors(instr)}です。")
    instr = instr + 1
  }

  hello("講義")
  hello("演習")
}
