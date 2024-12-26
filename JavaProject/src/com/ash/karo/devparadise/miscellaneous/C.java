package com.ash.karo.devparadise.miscellaneous;

interface I {

    static void a() {
		// TODO Auto-generated method stub
		
	}

    default void b() {
        a();
    }

    static void c() {
        a();
    }
}

interface O {
	default void b() {
		System.out.println("xyz");
	}
}

class D implements I, O {

	@Override
	public void b() {
		// TODO Auto-generated method stub
		O.super.b();
	}
	
}