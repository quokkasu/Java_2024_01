
public class EX13 {

}

//400~401 PAGEW

NoGeneric nogen = new NoGeneric();
String[] ss = new String[] {"홍길동","이순신","김유신"};



Object[] 



Integer[]ii = new Integer[] {1,2,3};

nogen.set(ii);
objs = nogen.get();
for(Object obj : objs) {
	Integer i = (Integer)obj;
	System.out.println(i);
}

System.out.println();
 
Generic<String> gen = new Generic<String>();
ss = new String[] {"홍길동","이순신","김유신"};

gen.set(ss);
gen.print();

for(String name : gen.get()) {
	//String name2 = (String)name;
	System.out.println(name);
}

ii = new Integer[] {1,2,3,4,5};
Generic<Integer> genInt = new Generic<Integer>();

genInt. set(ii);
genInt.print();

for(Integer i : genInt.get()) {
	System.out.print(i + " ");
}