public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int raund=1;

    Match(Fighter f1, Fighter f2,int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }
    void start(){
        if (check()){
            boolean firstPlayer = (int)(Math.random()*2) == 0;

            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("====== "+ raund +". RAUND ======");
                System.out.println(this.f1.name+" Sağlık: "+this.f1.health);
                System.out.println(this.f2.name+" Sağlık: "+this.f2.health);
                if (firstPlayer) {

                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                }
                else {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                }
                raund++;
            }
        }
        else{
            System.out.println("Dövüşcülerin sikletleri uygun değildir.");
        }
    }
    boolean check(){
        return (this.f1.weight <= maxWeight && this.f1.weight >= minWeight) && (this.f2.weight <= maxWeight && this.f2.weight>=minWeight);
    }

    boolean isWin(){
        if (this.f1.health  == 0){
            System.out.println("Oyunu Kazanan: "+this.f2.name);
            return true;
        }
        if(this.f2.health == 0){
            System.out.println("Oyunu Kazanan: "+this.f1.name);
            return true;
        }
        return false;
    }

}
