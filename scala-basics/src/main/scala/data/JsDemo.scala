package data

import play.api.libs.json._

object JsDemo {
  def transform(json: JsValue): JsValue = json match {
    case JsNull                  => JsString("I am null")
    case JsBoolean(value)        => JsBoolean(!value)
    case JsNumber(value)         => JsNumber(value * value)
    case JsString("urn" :: rest) => JsString(s"Hello $rest")
    case JsString(str)           => json
    case JsArray(values)         => JsArray(values.map(transform))
    case JsObject(values)        => JsObject(
      values.map {
        case t@("m" | "n", v) => t
        case (k, v)           => (k, transform(v))
      }
    )
  }

  object :: {
    def unapply(arg: String): Option[(String, String)] = arg.split(":") match {
      case Array(user, domain) => Some(user, domain)
      case _                   => None
    }
  }

}
