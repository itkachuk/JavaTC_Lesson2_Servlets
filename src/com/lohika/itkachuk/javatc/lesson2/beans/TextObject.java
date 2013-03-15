package com.lohika.itkachuk.javatc.lesson2.beans;

/**
 * Created with IntelliJ IDEA.
 * User: itkachuk
 * Date: 3/9/13 10:57 PM
 */
public class TextObject {
    private String text;

    public TextObject(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    @Override
    public String toString(){
        return text;
    }
}
