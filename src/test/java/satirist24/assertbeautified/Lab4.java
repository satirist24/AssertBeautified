package satirist24.assertbeautified;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BinaryOperator;

/**
 * Created on 08.04.15.
 */
public class Lab4 {
    
    static abstract class TextElement {
        
        protected TextElement[] elements;

        TextElement(String value) {
            
        }
        
        abstract void parse();

        public String toString() {
            String result = "";
            for (TextElement te : elements) {
                result += te.toString();
            }
            return result;

        }
        
    }

    static class Text extends TextElement {
        
        private String value;
        
        public Text(String value) {
            super(value);
            this.value = value;
        }
        
        void parse() {
            String[] sentences = value.split("[.]");
            elements = new TextElement[sentences.length];
            for (int i = 0; i < sentences.length; i++) {
                elements[i] = new Sentence(sentences[i]);
            }
        }
        
    }

    static class Sentence extends TextElement {
        
        String value;
        
        public Sentence(String value) {
            super(value);
            this.value = value;
            
        }
        
        void parse() {
            
            
        }
        
        public String toString() {
            return value;
            
        }
        
    }

    public static void main(String[] args) {
        Text t = new Text("Hello, my Name is Maryna. I like to fuck. I hate all of you.");
        t.parse();
        for (TextElement s : t.elements) {
            System.out.println(((Sentence) s).value);
        }
    }
    
    
}
