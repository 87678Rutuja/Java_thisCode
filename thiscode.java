class Demo{
	int x =10;
	Demo(){
		System.out.println("In Constractor");
		System.out.println(this);
		System.out.println(this.x);
		}
		void fun(){
			System.out.println(this);
			System.out.println(x);
		}

		public static void main(String[] ar){
			Demo obj1= new Demo();

			System.out.println(obj1);
			obj1.fun();
		}
}

