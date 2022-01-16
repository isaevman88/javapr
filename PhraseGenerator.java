public class PhraseGenerator{
	public static void main(String[] args){
          String[] wordListOne = {"круглосуточный", "мультиблоковый", "огромедный", "B-to-B",
                "безпроигрышный", "front-end", "интернет", "pervasive", "умный", "шести сигм",
                "Метод критического пути", "динамичный"};
        String[] wordListTwo = {"уполномоченный", "адаптивный", "value-added", "ориентированный", "чентрический", 
                "distributed", "clustered", "branded", "внешний", "позиционный", "сетевой", 
                "сфокусированный", "leveraged", "aligned", "целевой", "доступный", "корпаративный", "accelerated"};
        String[] wordListThree = {"процесс", "tipping-point", "решение", "архитектура", "проф пригодность",
                "стратегия", "мозговрыв", "портал", "пространство", "видение", "парадигма", "миссия"};
 int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLength);

        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Для успешного успеха нам требуется " + phrase);

	}
}
