# TPWebService
 
<h1>PARTIE 1 :</h1
<p>
 Dans cete partie on va créer un web service qu'on appelle 'BanqueWS', puis on va créer le serveur JaxWS
 qui déployé le web service 'BanqueWS' et on va créer aussi une classe qu'on appelle Compte.
</p>
<p>
 Après on va lancer le Serveur JaxWS, puis on va ouvrir le serveur dans le browser<br>
 Voici un exemple sous le format de xml :
</p>

![web_service_wsdl](https://user-images.githubusercontent.com/61559275/163152787-3b8472fa-16db-4826-8f4a-e548d3cd3519.PNG)

<p>
 Après on va tester le web serveur à l'aide de SoapUI.<br>
 Tout d'abord on va tester la méthode ConversionEuroToDH<br>
 Voci un exemple :
</p>

![image](https://user-images.githubusercontent.com/61559275/163155323-c395f584-9c76-4efc-af2b-bcd5ce9ffb5c.png)

<p>
 Voici un autre exemple mais dans cette exemple on va tester la méthode getCompte :
</p>

![image](https://user-images.githubusercontent.com/61559275/163297941-f0ac3852-9cd4-4072-aadf-c31cf450ca98.png)

<p>
 Voici un autre exemple mais dans cette exemple on va tester la méthode listComptes :
</p>

![image](https://user-images.githubusercontent.com/61559275/163298134-1f0667b0-794d-4983-91c2-e2464c516e4a.png)



<h1>PARTIE 2 :</h1>

<p>
 Dans cette partie on va créer un autre projet qu'on appelle ClientWS.
</p>
<a href="https://github.com/zakariaelidrissi/ClientWS">lien de ce projet dans mon compte GitHub</a>
<p>
 puis on va générer wsdl à partir du code java.
 Après on va créer une classe qu'on appelle ClientWS.
</p>

<p>
 On va communiqué le ClientWS avec le web service 'BanqueWS'.
 Voici un exemple : 
</p>

![image](https://user-images.githubusercontent.com/61559275/163165620-b4794148-4db4-4549-8e33-95487ca512ef.png)

<p>
 Voici un autre exemple :
</p>

![image](https://user-images.githubusercontent.com/61559275/163168149-a1951051-2da9-4114-b72e-5991e9efe019.png)

<h1>PARTIE 3 :</h1>

<p>Dans cette partie on va créer un simple projet avec C#, et on va generé un name space à partir WSDl :</p>
<a href="https://github.com/zakariaelidrissi/ConsoleApp2">lien de cette partie dans mon compte GitHub</a>


![image](https://user-images.githubusercontent.com/61559275/173189162-0dfdafc1-4781-4396-9276-984981c077d4.png)

<p>Voici la classe qu'on a créé :</p>

![image](https://user-images.githubusercontent.com/61559275/173189194-051e651c-f37e-4fb4-9a28-5802c90ba328.png)

<p>Voici le résultat de test :</p>

![image](https://user-images.githubusercontent.com/61559275/173189294-7fee809d-41d7-45ca-8049-6de49c484a6c.png)

