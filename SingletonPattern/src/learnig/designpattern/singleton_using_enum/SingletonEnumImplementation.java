package learnig.designpattern.singleton_using_enum;

public enum SingletonEnumImplementation {

	INSTANCE; //public static final in complied time

	private String name;

	public String getName(){
		return name;
	}

	public void setName(String newName){
		this.name=newName;
	}

}
