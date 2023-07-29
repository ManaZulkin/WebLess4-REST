package rest.webless4rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/translate/{st}")
public class MyRest {
    @GET
    public String translate(@PathParam("st") String s){
        String eng = "I don't know...";
        if (s.equalsIgnoreCase("слово")) {
            eng = "word";}
        if (s.equalsIgnoreCase("світ")) {
            eng = "world";}
        if (s.equalsIgnoreCase("робота")) {
            eng = "work";}
        if (s.equalsIgnoreCase("вік")) {
            eng = "age";}
        if (s.equalsIgnoreCase("книга")) {
            eng = "book";}
        if (s.equalsIgnoreCase("життя")) {
            eng = "life";}
        if (s.equalsIgnoreCase("кохання")) {
            eng = "love";}
        if (s.equalsIgnoreCase("удар")) {
            eng = "kick";}
        if (s.equalsIgnoreCase("їжа")) {
            eng = "food";}
        if (s.equalsIgnoreCase("собака")) {
            eng = "dog";}
        if (s.equalsIgnoreCase("кіт")) {
            eng = "cat";}
        if (s.equalsIgnoreCase("будинок")) {
            eng = "house";}
        if (s.equalsIgnoreCase("кінь")) {
            eng = "horse";}
        if (s.equalsIgnoreCase("джерело")) {
            eng = "source";}
        if (s.equalsIgnoreCase("чарівник")) {
            eng = "wizard";}
        if (s.equalsIgnoreCase("магія")) {
            eng = "magick";}
        if (s.equalsIgnoreCase("меч")) {
            eng = "sword";}
        if (s.equalsIgnoreCase("лук")) {
            eng = "bow";}
        if (s.equalsIgnoreCase("джава")) {
            eng = "java";}
        if (s.equalsIgnoreCase("кава")) {
            eng = "coffe";}
        if (s.equalsIgnoreCase("чай")) {
            eng = "tee";}
        return eng;
    }
}
