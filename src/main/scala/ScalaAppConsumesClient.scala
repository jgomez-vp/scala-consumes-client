import java.util.UUID

import org.killbill.billing.client.actor.KillBillClient
import org.killbill.billing.client.model.{InvoiceEmail, AccountEmail, Account}
import spray.http.{BasicHttpCredentials, HttpHeaders}

/**
 * Created by jgomez on 26/10/2015.
 */
object ScalaAppConsumesClient extends App {

  // KillBill API URL (if not specified in the constructor)
  val killBillUrl = "http://localhost:8080/1.0/kb"

  // KillBill API Headers (if not specified in the constructor)
  val headers = List(
    HttpHeaders.Authorization.apply(BasicHttpCredentials.apply("admin", "password")),
    HttpHeaders.RawHeader.apply("X-Killbill-CreatedBy", "admin"),
    HttpHeaders.RawHeader.apply("X-Killbill-ApiKey", "hootsuite"),
    HttpHeaders.RawHeader.apply("X-Killbill-ApiSecret", "hootsuite")
  )

  val client: KillBillClient = new KillBillClient(killBillUrl, headers)

  /**
   * Get Account Timeline
   */
//  println(s"Timeline: " + client.getAccountTimeline(UUID.fromString("df795e04-ca64-448b-ac01-ab58e8c85d0b")))

  /**
   * Update Email Notifications for Account
   */
//  val invoiceEmail = InvoiceEmail.apply(Option.apply("df795e04-ca64-448b-ac01-ab58e8c85d0b"), Option.apply(true))
//  val response: String = client.updateEmailNotificationsForAccount(invoiceEmail, UUID.fromString("df795e04-ca64-448b-ac01-ab58e8c85d0b"))
//  if (response.contains("200")) {
//    println(s"E-mail Notifications updated succesfully")
//  }
//  else {
//    println(s"An error occurred. Message: " + response)
//  }

  /**
   * Get Email Notifications for Account
   */
//  println("Email Notifications for Account: " + client.getEmailNotificationsForAccount(UUID.fromString("df795e04-ca64-448b-ac01-ab58e8c85d0b")));

  /**
   * Get Emails for Account
   */
//  println("Emails for Account: " + client.getEmailsForAccount(UUID.fromString("df795e04-ca64-448b-ac01-ab58e8c85d0b")));

  /**
   * Remove Email from Account
   */
//  val response: String = client.removeEmailFromAccount(UUID.fromString("df795e04-ca64-448b-ac01-ab58e8c85d0b"), "test@test2.com")
//  if (response.contains("200")) {
//    println(s"E-mail removed succesfully")
//  }
//  else {
//    println(s"An error occurred. Message: " + response)
//  }

  /**
   * Add Email to Account
   */
//  val accountEmail = AccountEmail.apply(Option.apply("df795e04-ca64-448b-ac01-ab58e8c85d0b"), Option.apply("test@test2.com"))
//  val response: String = client.addEmailToAccount(accountEmail, UUID.fromString("df795e04-ca64-448b-ac01-ab58e8c85d0b"))
//  if (response.contains("201")) {
//    println(s"E-mail added succesfully")
//  }
//  else {
//    println(s"An error occurred. Message: " + response)
//  }

  /**
   * Search Accounts
   */
//  println("Accounts found with SearchKey 'lalala': " + client.searchAccounts("lalala"))

  /**
    * Get Accounts
   */
//  println("Accounts: " + client.getAccounts())

  /**
   * Get Account By External Key
   */
//  val account: Account = client.getAccountByExternalKey("jgomez").asInstanceOf[Account];
//  println(s"Got Account: " + account)

  /**
   * Get Account by Id
   */
//  val account: Account = client.getAccountById(UUID.fromString("c848cfa4-f4fe-4b1b-906c-3d4e92eb44c3")).asInstanceOf[Account];
//  println(s"Got Account: " + account)

  /**
   * Create Account
   */
//  val account = Account.apply(None, Option.apply("kbanman"), None, None, Option.apply("Kelly Banman"), None, Option.apply("kbanman@velocitypartners.net"), None, Option.apply("USD"), None, Option.apply("UTC"), None, None, None, None, None, None, None, None, None, None, None)
//  val response: String = client.createAccount(account.asInstanceOf[Account])
//  if (response.contains("201")) {
//    println(s"Account created succesfully")
//  }
//  else {
//    println(s"An error occurred. Message: " + response)
//  }

  /**
   * Update Account
   */
//  val account = Account.apply(None, Option.apply("kbanman"), None, None, Option.apply("Kelly Banman"), None, Option.apply("kbanman2@velocitypartners.net"), None, Option.apply("USD"), None, Option.apply("UTC"), None, None, None, None, None, None, None, None, None, None, None)
//  val response: String = client.updateAccount(account.asInstanceOf[Account], UUID.fromString("2a68b33c-ce15-4c73-bf79-5df9d6d03042"))
//  if (response.contains("200")) {
//    println(s"Account updated succesfully")
//  }
//  else {
//    println(s"An error occurred. Message: " + response)
//  }
}