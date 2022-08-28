package taller3.televisores;

public class Control {
    private TV tv;

    public void turnOn() {this.tv.turnOn();}

    public void turnOff() {this.tv.turnOff();}

    public void canalUp() {this.tv.canalUp();}

    public void canalDown() {this.tv.canalDown();}

    public void volumenUp() {this.tv.volumenUp();}

    public void volumenDown() {this.tv.volumenDown();}

    public void setCanal(int Ncanal) {this.tv.setCanal(Ncanal);}

    public void enlazar(TV Ntv){
        tv = Ntv;
        Ntv.setControl(this);
    }

    public TV getTv() {return tv;}

    public void setTv(TV tv) {this.tv = tv;}
}
