package java_playground;


    
    public abstract class PhonecameraAppMain {

        PhoneCameraInterface phoneCameraInterface;

        public void setPhoneCameraInterface(PhoneCameraInterface phoneCameraInterface) {
            this.phoneCameraInterface = phoneCameraInterface;
        }

        public void share() {
            phoneCameraInterface.share();
        }

        public void take() {
            System.out.println("Invoke Take Method.");
        }

        public void save() {
            System.out.println("Invoke Save Method.");
        }

        
        public abstract void edit();


    }