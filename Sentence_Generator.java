import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;
public class Sentence_Generator {

	public static void main(String[] args) {
		ArrayList<String>article = new ArrayList<String>();
		article.add("a");
		article.add("an");
		article.add("the");
		
		ArrayList<String>adjective = new ArrayList<String>();
		adjective.add("fat");
		adjective.add("big");
		adjective.add("small");
		
		ArrayList<String>noun = new ArrayList<String>();
		noun.add("cat");
		noun.add("rat");
		noun.add("house");
		
		ArrayList<String>adverb = new ArrayList<String>();
		adverb.add("slowly");
		adverb.add("gently");
		adverb.add("quickly");
		
		ArrayList<String>verb = new ArrayList<String>();
		verb.add("ate");
		verb.add("sat on");
		verb.add("pushed");
		
		HashMap<String,ArrayList<String>> words = new HashMap<String,ArrayList<String>>();
		words.put("article", article);
		words.put("adjective",adjective);
		words.put("noun",noun);
		words.put("adverb",adverb);
		words.put("verb",verb);
		
		ArrayList<String>keys = new ArrayList<String>();
		keys.add("article");
		keys.add("adjective");
		keys.add("noun");
		keys.add("adverb");
		keys.add("verb");
		keys.add("article");
		keys.add("adjective");
		keys.add("noun");
		
		Random rgen = new Random();
		String sentence = "";
		for (String key:keys) {
			int r = rgen.nextInt(3);
			sentence += words.get(key).get(r) + " ";
		}
		
		System.out.println(sentence);
	}

}
