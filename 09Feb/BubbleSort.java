package SortingSearching;

public class BubbleSort {
	
	public static void bubbleSort(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void bubbleSort(Student [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j].getMarks()<arr[j+1].getMarks()) {
					Student temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void compBubbleSort(Student [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j].getJavaMarks()<arr[j+1].getJavaMarks()) {
					Student temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				else if(arr[j].getJavaMarks()==arr[j+1].getJavaMarks()) {
					if(arr[j].getFsMarks()<arr[j+1].getFsMarks()) {
						Student temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
					else if(arr[j].getFsMarks()==arr[j+1].getFsMarks()) {
						if(arr[j].getCMarks()<arr[j+1].getCMarks()) {
							Student temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
					}
				}
			}
		}
	}
	
	public static void main(String [] args) {
		int [] arr1= {5,4,3,2,1};
		bubbleSort(arr1);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		Student [] arr2= {
				new Student("A",45,30,56,2),
				new Student("B",45,30,59,3),
				new Student("C",95,91,80,1),
				new Student("D",13,15,19,4),
				new Student("E",54,30,40,5),
				new Student("F",43,45,55,6),
		};
		bubbleSort(arr2);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		compBubbleSort(arr2);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
	}

}


class Student {
	String name;
	private int javaMarks;
	private int fsMarks;
	private int CMarks;
	private int id;
	
	//constructor
	public Student(String name, int javaMarks, int fsMarks, int cMarks, int id) {
		this.name = name;
		this.javaMarks = javaMarks;
		this.fsMarks = fsMarks;
		CMarks = cMarks;
		this.id = id;
	}

	//getters setters
	public int getJavaMarks() {
		return javaMarks;
	}

	public void setJavaMarks(int javaMarks) {
		this.javaMarks = javaMarks;
	}

	public int getFsMarks() {
		return fsMarks;
	}

	public void setFsMarks(int fsMarks) {
		this.fsMarks = fsMarks;
	}

	public int getCMarks() {
		return CMarks;
	}

	public void setCMarks(int cMarks) {
		CMarks = cMarks;
	}
	
	public int getMarks() {
		return javaMarks+fsMarks+CMarks;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", javaMarks=" + javaMarks + ", fsMarks=" + fsMarks + ", CMarks=" + CMarks
				+ ", id=" + id + "]";
	}
}

