package view;

import matheus.ListaInt.ListaInt;

public class Main {

	public static void main(String[] args) throws Exception
	{
		int[] vetA = {3, 5, 8, 12, 9, 7, 16};
		int[] vetB = {9, 6, 2, 3, 7};
		
		ListaInt A = new ListaInt();
		ListaInt B = new ListaInt();
		ListaInt U = new ListaInt();
		ListaInt I = new ListaInt();
		
		int tamA = vetA.length;
		int tamB = vetB.length;
		
		
		A.addFirst(vetA[0]);
		B.addFirst(vetB[0]);
		

		for(int i = 1; i < tamA; i++)
		{
			A.addLast(vetA[i]);
		}
		
		for(int i = 1; i < tamB; i++)
		{
			B.addLast(vetB[i]);
		}
		
		for (int i = 0; i < tamA; i++)
		{
			for(int j = 0; j < tamB; j++)
			{
				if(A.get(i) == B.get(j))
				{
					I.addFirst(A.get(i));							
				}
			}
		}
		
		for (int i = 0; i < (A.size() > B.size() ? A.size() : B.size()); i++)
		{
			if(i < A.size())
			{
				U.addFirst(A.get(i));					
			}
			if (i < B.size())
			{
				U.addFirst(B.get(i));
			}
		}
		
		for (int i = 0; i < U.size(); i++)
		{
		int cont = 0;
			for (int j = 0; j < U.size(); j++)
			{
				if (U.get(i) == U.get(j))
				{
					if (cont != 0)
					{
						U.remove(j);
					}
					cont++;
				}
			}
		}
		
		System.out.print("Interseccao\n");
		
		while(!I.isEmpty())
		{		
			System.out.println(I.get(0));
			I.removeFirst();
		}
		
		System.out.println("\nUniao");
		
		while(!U.isEmpty())
		{
			System.out.println(U.get(0));
			U.removeFirst();
		}
	}

}
