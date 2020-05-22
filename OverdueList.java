public class OverdueList<E extends Book>{
    private  E OverdueItems;
     public OverdueList(E OverdueItems){
         this.OverdueItems= OverdueItems;
     }
     public E getOverdueItems(){
         return OverdueItems;

     }
     public void setOverdueItems(E OverdueItem){
         this.OverdueItems= OverdueItem;
     }
    
}