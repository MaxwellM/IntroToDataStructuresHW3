/**
 * Created with IntelliJ IDEA.
 * User: Maxwell
 * Date: 11/4/13
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommandParser {
	
	public RecordManager recordManager;
	
	public CommandParser(){
		
	}
	
	public void performCommand(String command){
		//Split command input by spaces into a list of strings
		String[] splited  = command.split(" ");
		
		//Switch statement to see if it's a valid command
        if (splited[0].equals("c")) {
            ;
            try {
                if (splited.length != 2) {
                    this.err();
                    return;
                }
                Integer x = Integer.valueOf(splited[1]);
                if ((int) x == x) {
                    this.Create(x);
                }
            } catch (NumberFormatException e) {
                this.err();
            }

        } else if (splited[0].equals("s")) {
            ;
            try {
                if (splited.length != 3) {
                    this.err();
                    return;
                }
                Integer x = Integer.valueOf(splited[1]);
                Float y = Float.valueOf(splited[2]);
                if ((int) x == x && (Float) y == y) {
                    this.StorePair(x, y);
                }
            } catch (NumberFormatException e) {
                this.err();
            }

        } else if (splited[0].equals("e")) {
            ;
            try {
                if (splited.length != 2) {
                    this.err();
                    return;
                }
                Integer x = Integer.valueOf(splited[1]);
                if ((int) x == x) {
                    this.Exists(x);
                }
            } catch (NumberFormatException e) {
                this.err();
            }

        } else if (splited[0].equals("r")) {
            ;
            try {
                if (splited.length != 2) {
                    this.err();
                    return;
                }
                Integer x = Integer.valueOf(splited[1]);
                if ((int) x == x) {
                    this.retreiveData(x);
                }
            } catch (NumberFormatException e) {
                this.err();
            }

        } else if (splited[0].equals("d")) {
            ;
            try {
                if (splited.length != 2) {
                    this.err();
                    return;
                }
                Integer x = Integer.valueOf(splited[1]);
                if ((int) x == x) {
                    this.delete(x);
                }
            } catch (NumberFormatException e) {
                this.err();
            }


        } else {
            this.err();

        }
	}
	//Create the RecordManager
	private void Create(int k){
		recordManager = new RecordManager(k);
	}
	
	private void StorePair(int k, float d){
		recordManager.insert(k, d);
	}
	
	private void Exists(int k){
		boolean exists = recordManager.exists(k);
		if(exists == true){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
	
	private void retreiveData(int k){
		Node temp = recordManager.search(k);
		if(temp == null){
			//No key exists
			System.out.println();
		}else{
			System.out.println(temp.d);
		}
	}
	
	private void delete(int k){
		recordManager.delete(k);
	}
	
	private void err(){
		System.out.println("Input is not a valid command.");
	}
}