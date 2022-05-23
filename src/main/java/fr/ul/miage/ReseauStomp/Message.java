package fr.ul.miage.ReseauStomp;

public class Message {
/**
* Code du message
*/
private String code;
/**
* De（Garantie unique）
*/
private String form;
/**
* Depuis （Garantie unique）
*/
private String to;
/**
* Contenu
*/
private String content;
public String getCode() {
return code;
}
public void setCode(String code) {
this.code = code;
}
public String getForm() {
return form;
}
public void setForm(String form) {
this.form = form;
}
public String getTo() {
return to;
}
public void setTo(String to) {
this.to = to;
}
public String getContent() {
return content;
}
public void setContent(String content) {
this.content = content;
}
}