package com.imalittletester.jam;


public class ApricotJam extends Jam{

    // fields

    /*public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;*/

    public float apricotQty;
    public String apricotUom;

    //public int jarQty;
    //public int jarCapacity;

    // public boolean isDietetic;

    //methods
    public ApricotJam (){}

    public ApricotJam(String sweetener) {
        this.sweetener = sweetener;
    }

    public Jar jar;



    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom, Jar jar, boolean isDietetic) {
       /* this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;*/

        super(sweetener,sweetenerQty, sweetenerUom, isDietetic); // se ia din clasa de baza (base class, super class)
        this.apricotQty = apricotQty;
        this.apricotUom = apricotUom;
        this.jar = jar;
        //this.jarQty = jarQty;
        //this.jarCapacity = jarCapacity;
       // this.isDietetic = isDietetic;
    }
        @Override
        public void makeJam() {
            //System.out.println("Adding "+ sweetenerQty + " " + sweetenerUom + " of " + sweetener);
            super.makeJam();
            System.out.println("Also adding " + apricotQty+ " " + apricotUom + " of apricots");
            System.out.println("Boiling for " + preparationTime() + " minutes");
            System.out.println("Packing in " + jar.jarQty + " jars of " + jar.jarCapacity + " ml");
            //System.out.println("Is dietetic? " + isDietetic);
        }

        private int preparationTime() { // private pt ca o folosim doar aici, in clasa asta)
            return 30;
        }
    @Override
    public String toString() {
        return "ApricotJam{" +
                "sweetener='" + sweetener + '\'' +
                ", sweetenerQty=" + sweetenerQty +
                ", sweetenerUom='" + sweetenerUom + '\'' +
                ", apricotQty=" + apricotQty +
                ", apricotUom='" + apricotUom + '\'' +
                //", jarQty=" + jarQty +
                //", jarCapacity=" + jarCapacity +
                ", isDietetic=" + isDietetic +
                '}';
    }
}
