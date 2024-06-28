
public class EX07 {
   public static void main (String args[]) {
      //221 Page
      GraphicCard gc = new GraphicCard(); // 그래픽카드 객체
      gc.process();
      
      Game g1 = new Game(); // 게임 객체
      g1.playGame1(gc);               //================에러발생 이유==================
//   g1.playGame2((Amd)gc);      			//<-- (1)      타입만 맞춰 주어 문법 오류는 없으나
//   g1.playGame3((Nvidia)gc);   			//<--   (2)      실제 들어가 있는 주소는 
                                      //               다르기 때문에
      gc = new Amd();                 //            
      gc.process();                   //               RunTime 에러가 발생한다.
      g1.playGame1(gc);               //
      g1.playGame2((Amd)gc);      		//
//   g1.playGame3((Nvidia)gc);   			//<-- (3)      (1) -- 타입은 Amd     / 주소는 new GraphicCard()
                                      //             (2) -- 타입은 Nvidia / 주소는 new GraphicCard()
      gc = new Nvidia();            	//             (3) -- 타입은 Nvidia / 주소는 new Amd()
      gc.process();                   //             (4) -- 타입은 Amd       / 주소는 new Nvidia()
      g1.playGame1(gc);               //
//   g1.playGame2((Amd)gc);      			//<-- (4)
      g1.playGame3((Nvidia)gc);   		//===============================================
      
      GraphicCard arrGC[] = new GraphicCard[4];
      arrGC[0] = new GraphicCard();
      arrGC[1] = new Amd();
      arrGC[2] = new Nvidia();
      arrGC[3] = new GraphicCard();
      System.out.println("================================");
      
      for(GraphicCard gc1 : arrGC) {
         gc1.process();
      }
      
      
   }
}











class Game {
   // playGame1 메소드는 GraphicCard, Amd, Nvidia 전부 다 게임할 수 있음
   void playGame1(GraphicCard card) {
      card.process();
   }
   
   // playGame2 메소드는 Amd 카드만 갖고 게임할 수 있음
   void playGame2(Amd card) {
      card.process();
   }
   
   // playGame3 메소드는 Nvidia 카드만 갖고 게임할 수 있음
   void playGame3(Nvidia card) {
      card.process();
   }
}



class GraphicCard {
   int memory;
   public void process() {
      System.out.println("그래픽 처리");
   }
   @Override
   public String toString() {
      return "GraphicCard";
   }
}

class Amd extends GraphicCard {
      
   @Override
   public void process() {
      System.out.println("Amd 그래픽 처리");
   }
   @Override
   public String toString() {
      return "Amd";
   }
}

class Nvidia extends GraphicCard {
   
   @Override
   public void process() {
      System.out.println("Nvidia 그래픽 처리");
   }
   @Override
   public String toString() {
      return "Nvidia";
   }
}