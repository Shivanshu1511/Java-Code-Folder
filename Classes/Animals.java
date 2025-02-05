
class Animals {
    public void sound(){
        System.out.print("Make Sound");
    }
class Dog extends Animals {
    public void sound(){
        Ssytem.out.print("Barke");
    }
}

    public void main(String[] args){
        Animals gt = new Animals();
        gt.sound();
    }
}