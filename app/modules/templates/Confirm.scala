package modules.mail.templates

object Confirm {

  def template(victim: String, user: String) = {
    s"""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8"><meta name="viewport" content="width=device-width, initial-scale=1.0"><link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'></head><style> body {max-width: 300px; font-family: "Montserrat"; } table {font-size: 18px; } table:first-child {font-size: 22px; } a {text-decoration: none; color: white; font-weight: bold; } .btn {width: 100%; padding: 20px; margin: 20px 0; border-radius: 5px; text-align: center; } table {margin: 20px; width: 100%; } .valid {background-color: #50E3C2; } .error {background-color: #E35C4F; } </style> </head> <body> <table> <tr> <td>Salut ${user},</td> </tr> </table> <table> <tr> <td> Aujourd'hui c'était à ${victim} de payer ses croissants. </td> </tr> </table> <table> <tr> <td> On a besoin de savoir s'il a bien tenu son engagement. </td> </tr> </table> <table> <tr> <td class="btn valid"> <a href="#">Je confirme il a payé</a> </td> </tr> </table> <table> <tr> <td class="btn error"> <a href="#">Sentence, il s'est débiné !</a> </td> </tr> </table> </body> </html>"""
  }
}