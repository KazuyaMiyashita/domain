package domain4

import java.net.URL

case class ProfileImage(path: String, extension: String) {

  def url: URL = new URL(ProfileImage.baseUrl + path + "." + extension)

}

object ProfileImage {

  val baseUrl = "http://example.com/users/"

}
