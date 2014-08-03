object NeverNull {

  implicit class ConvertToOption[A](val objeto: A) extends AnyVal {
    def toOption = Option(objeto)
  }

}
