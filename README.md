# JavaWebServicesSOAP

Projet de Webservices en JAVA et en SOAP pour gérer des auteurs et des livres.

## Structure

Ce projet contient un client et un serveur, situé tout deux dans le dossier `src/main/java/io/helyx`.

### Serveur

Le serveur possède la classe `Main`, utile pour lancer le programme, et mettant à disposition les webservices.
Le code contient les types de fichiers suivants : 

- `Service` : Classe mettant à disposition des méthodes en ligne.
- `Controller` : Classe réalisant les requêtes sur la base de donnée, pour retourner des objets métier.
- `Model` : Objet métier, Classe POJO décrivant les attributs et méthodes d'une entité.
- `Requests` : Classe contenant des constantes décrivant des requêtes à la base de donnée.

La base de donnée est une base **PostgreSQL**. Il est nécessaire d'avoir un postgresql tournant sur le port `5432` pour faire fonctionner le programme.
La base de donnée est paramétrée dans la class `PostgreSQLJDBC`. La méthode `init()`créer la connexion.

### Client

Le client possède une seule classe `Client`, pour lancer le programme. Il permet de tester le serveur en réalisant des requêtes CRUD sur les auteurs sur le serveur.

## Fonctionnalités

Serveur : 
- ✅ Création des tables `author` et `book`
- ✅ CRUD sur des auteurs
- ❌ CRUD sur des livres
- ❌ Retourner les auteurs directement avec les livres

Client : 
- ✅ Utilisation du serveur dans un client Java
- ❌ CLI pour gérer les auteurs
- ❌ CLI pour gérer les livres

