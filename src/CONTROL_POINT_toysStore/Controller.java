package CONTROL_POINT_toysStore;

import CONTROL_POINT_toysStore.data.Lototrone;
import CONTROL_POINT_toysStore.view.ViewModel;

public class Controller {
    ViewModel vm = new ViewModel();
    Lototrone lt = new Lototrone();

    public Controller(ViewModel viewModel, Lototrone lototrone){
        this.lt =lototrone;
        this.vm = viewModel;
    }

    public void letsPlay(){
        lt.fullArrivale();
        vm.greeting();
        int tryCounter = vm.getInfo();
        int i = 0;
        while(i<tryCounter){
            vm.menu();
            int choice = vm.getInfo();
            if(choice==1){
                if(lt.getToysPull().size()==5){
                    lt.halfArrivale();
                }
                vm.showToys(lt.getToysPull());
                int toyID = vm.getInfo();
                if(lt.play(lt.getToysPull().get(toyID))==1){
                    lt.moveToPrizePull(toyID);
                    vm.win();
                } else if (lt.play(lt.getToysPull().get(toyID))==0) {
                    vm.loose();
                }else {
                    vm.superPrize();
                    lt.moveToPrizePull();
                    lt.fullArrivale();
                }
                i++;
            } else if (choice==2) {
                break;
            }
        }
        vm.ending(lt.getPrizePull(),tryCounter);
    }

}
