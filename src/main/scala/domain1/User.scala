package domain1

import java.net.URL

case class User(
  id: Long,
  name: Option[String],
  profileImageUrl: Option[URL]
) {

  /**
    * ユーザーは、名前とプロフィール画像の両方を設定されているか、
    * もしくは両方を未設定にされているかのいずれかでなければならない。
    */
  assert {
    name.isDefined && profileImageUrl.isDefined ||
    name.isEmpty && profileImageUrl.isEmpty
  }

  /**
    * 名前・プロフィール画像が設定されているユーザーを登録済みユーザー、
    * 両方とも未設定のユーザーを仮ユーザーとする。
    */
  def isRegisteredUser: Boolean = name.isDefined && profileImageUrl.isDefined

}
