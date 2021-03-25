public class Runner {
    public int enumType (EditorType editorType) {
        switch (editorType) {
            case WORD: {
                return 1;
            }
            case NOTEPAD: {
                return 2;
            }
            case SIMPLENOTE: {
                return 3;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Runner r1 = new Runner();
        int p = r1.enumType(EditorType.SIMPLENOTE);
        switch (p) {
            case 1: {
                System.out.println("The object of the Word class was created");
                Word w = new Word();
                break;
            }
            case 2: {
                System.out.println("The object of the Notepad class was created");
                Notepad n = new Notepad();
                break;
            }
            case 3: {
                System.out.println("The object of the Simplenote class was created");
                Simplenote s = new Simplenote();
                break;
            }
            case 0: {
                System.out.println("Error!: Object was not created.");
            }
        }



    }
}
