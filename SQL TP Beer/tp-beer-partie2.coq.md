## 10 Listez pour chaque ticket la quantité totale d’articles vendus. (Classer par quantité décroissante)

```mysql
SELECT numero_ticket, SUM(quantite) AS qte_totale
FROM ventes
GROUP BY numero_ticket
ORDER BY qte_totale DESC;
```

## 11 Listez chaque ticket pour lequel la quantité totale d’articles vendus est supérieure à 500. (Classer par quantité décroissante)

```mysql
SELECT numero_ticket, SUM(quantite) AS qte_totale
FROM ventes
GROUP BY numero_ticket
HAVING SUM(quantite) >500
ORDER BY qte_totale DESC;
```

## 12 Listez chaque ticket pour lequel la quantité totale d’articles vendus est supérieure à 500. On exclura du total, les ventes ayant une quantité supérieure à 50 (classer par quantité décroissante)

```mysql

SELECT numero_ticket, SUM(quantite) AS qte_totale
FROM ventes
WHERE quantite < 50
GROUP BY numero_ticket
HAVING SUM(quantite) >500
ORDER BY qte_totale DESC;

```

## 13 Listez les bières de type ‘Trappiste’. (id, nom de la bière, volume et titrage)

```mysql

SELECT id_article, nom_article, volume, titrage
FROM article
INNER JOIN `type` ON `type`.id_type = article.id_type
WHERE `type`.nom_type = "Trappiste"
```

## 14 Listez les marques de bières du continent ‘Afrique’

```mysql
SELECT nom_marque
FROM marque
INNER JOIN pays ON marque.id_pays = pays.id_pays
INNER JOIN continent ON pays.id_continent = continent.id_continent
WHERE continent.nom_continent = "Afrique"
```

## 15 Lister les bières du continent ‘Afrique’

```mysql
SELECT nom_article
FROM article
WHERE article.id_marque IN (SELECT id_marque
							FROM marque
							INNER JOIN pays ON marque.id_pays = pays.id_pays
							INNER JOIN continent ON pays.id_continent = continent.id_continent
							WHERE continent.nom_continent = "Afrique")
```

## 16. Lister les tickets (année, numéro de ticket, montant total payé). En sachant que le prix de vente est égal au prix d’achat augmenté de 15%.

```mysql

# prix total pour chaque bière d'un ticket (= chaque ligne dans vente)
CREATE VIEW prix_vente AS
SELECT ventes.annee, ventes.numero_ticket, article.prix_achat, ventes.quantite, ventes.quantite * article.prix_achat * 1.15 AS px_vente
FROM ventes
INNER JOIN article ON article.id_article = ventes.id_article;

# CREATE VIEW montant_par_ticket AS
SELECT numero_ticket, annee, SUM(px_vente) as montant_total
FROM `prix_vente`
GROUP BY numero_ticket, annee #  à cause de ONLY_FULL_GROUP_BY

```

## 17  Donner le C.A. par année.

```mysql
SELECT annee, SUM(montant_total)
FROM `montant_par_ticket`
GROUP BY annee
```

## 18. Lister les quantités vendues de chaque article pour l’année 2016.

```mysql



```

## 19. Lister les quantités vendues de chaque article pour les années 2014, 2015, 2016.

```mysql

```

