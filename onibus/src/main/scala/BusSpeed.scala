object BusSpeed {
  def main(args: Array[String]){
    val speed = if (args.length > 0) args(0) else "0"
    val lines = sc.textFile("/home/bamorim/ufrj/bigdata/onibus/onibus.csv")

    lines.drop(1).filter(_.split(',').last == speed).map(_.split(',')(1)).foreach(println)
  }
}
