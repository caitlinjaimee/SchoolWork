
    public abstract class Fines implements iFine {

        public String NameofDriver;
        public String Speed;
        public String FinePayable;


        public Fines (String NameofDriver,String Speed,String FinePayable){
            this.NameofDriver=NameofDriver;
            this.Speed=Speed;
            this.FinePayable=FinePayable;
        }

        public String getNameofDriver(){
            return NameofDriver;
        }

        public String getSpeed(){
            return Speed;
        }
        public String FinePayable(){
            if(Speed<=120)then
                    Speed*10.40
        }
}
