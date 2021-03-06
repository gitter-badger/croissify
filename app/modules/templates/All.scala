package modules.mail.templates

object All {

  def template(victim: String, message: String, zencroissantURL: String) = {
    s"""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> <html xmlns="http://www.w3.org/1999/xhtml"> <head> <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> <meta name="viewport" content="width=device-width, initial-scale=1.0"> <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'> </head> <style> body {max-width: 400px; font-family: "Montserrat"; color: #4A4A4A;} table {font-size: 18px; } table.layout { width: 600px; padding: 0 100px 100px 100px;} table.title {font-size: 22px; } a {text-decoration: none; color: white; font-weight: bold; } .btn {width: 100%; padding: 20px; margin: 20px 0; border-radius: 5px; text-align: center; box-sizing: border-box;} table.layout table {margin: 20px 0; width: 100%;} .valid {background-color: #50E3C2; } .error {background-color: #E35C4F; } </style> </head> <body> <table class="layout"> <tr> <td> <table class="title"> <tr> <td>Salut,</td> </tr> </table> <table> <tr> <td> Aujourd'hui ${victim} s'est fait avoir et devra payer ses croissants. </td> </tr> </table> <table> <tr> <td> Petite Dédicace : ${message} </td> </tr> </table> <table> <tr> <td> On aura besoin de toi pour savoir si il a bien tenu son engagement. </td> </tr> </table> <table> <tr> <td class="btn valid"> <a href="${zencroissantURL}">Aller sur Zencroissant</a> </td> </tr> </table> </td> </tr> </table> </body> </html>"""
  }
}
