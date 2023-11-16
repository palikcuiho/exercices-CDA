## Docker

Si vous avez déjà vu Docker, créez via docker un conteneur MySQL et importez le fichier `beer.sql` dans votre conteneur.

Si vous n'avez pas encore vu Docker, importez le fichier `beer.sql` dans votre base de données MySQL ou demandez à votre
formateur de vous aider ou de vous donner le docker-compose.

### Prérequis

- Vous devez avoir un dockerfile et un docker-compose.yml
- Vous ne devez pas utiliser de `bind mount` !
- Vous avez le droit d'utiliser un `volume`

## Etude du modèle

### Effectuez un reverse engineering du modèle

- Quelles sont les tables ?

### Il y a des mauvaises pratiques dans ce modèle, lesquelles ?


## Exercices

Réalisez les requêtes suivantes :

### Quels sont les tickets qui comportent l’article d’ID 500, afficher le numéro de ticket uniquement ?

```mysql
SELECT numero_ticket
FROM ventes
WHERE id_article = 500;
```

### Afficher les tickets du 15/01/2014.

```mysql
SELECT numero_ticket
FROM ticket
WHERE date_vente = "2014-01-15 00:00:00";
```

### Afficher les tickets émis du 15/01/2014 et le 17/01/2014.

```mysql
SELECT numero_ticket
FROM ticket
WHERE date_vente >= "2014-01-15 00:00:00" AND date_vente <= "2014-01-17 00:00:00";
```

### Afficher la liste des articles apparaissant à 50 et plus exemplaires sur un ticket.

```mysql
SELECT article.nom_article, ventes.quantite
FROM ventes
INNER JOIN article ON ventes.id_article = article.id_article
WHERE ventes.quantite >= 50;
```

### Quelles sont les tickets émis au mois de mars 2014.

```mysql
SELECT numero_ticket
WHERE YEAR(date_vente) = 2014 && MONTH(date_vente) = 03
```

### Quelles sont les tickets émis entre les mois de mars et avril 2014 ?

```mysql
SELECT numero_ticket, date_vente
from ticket
WHERE YEAR(date_vente) = 2014 AND (MONTH(date_vente) = 03 OR MONTH(date_vente) = 04)
```

### Quelles sont les tickets émis au mois de mars et juin 2014 ?

```mysql
SELECT numero_ticket, date_vente
from ticket
WHERE YEAR(date_vente) = 2014 AND (MONTH(date_vente) = 03 OR MONTH(date_vente) = 04)
```

### Afficher la liste des bières classée par couleur. (Afficher l’id et le nom)

```mysql
SELECT article.nom_article, article.id_couleur, couleur.nom_couleur
FROM article
INNER JOIN couleur ON article.id_couleur = couleur.id_couleur
ORDER BY couleur.id_couleur;
```

### Afficher la liste des bières n’ayant pas de couleur. (Afficher l’id et le nom)

```mysql
SELECT nom_article
FROM article
WHERE ISNULL(id_couleur)
```