# Application avec ViewPager2 et Fragments

## Description

Cette application Android utilise `ViewPager2` pour permettre une navigation fluide entre trois fragments :

1. **Fragment Présentation** : Introduit l'application avec un titre et un texte descriptif.
2. **Fragment Liste** : Affiche une liste de villes ou de pays à l'aide d'un `RecyclerView`.
3. **Fragment Présentation avec image** : Montre une image en haut suivie d'un texte explicatif.

L'application utilise un `ViewPager2` pour une navigation horizontale entre ces fragments, offrant une expérience utilisateur fluide et intuitive.

## Fonctionnalités

- **Navigation fluide** : Utilisation de `ViewPager2` pour passer d'un fragment à l'autre.
- **RecyclerView** : Affichage d'une liste dynamique de 5 éléments dans le deuxième fragment.
- **Image avec texte** : Présentation visuelle dans le troisième fragment.

## Structure du projet

1. **MainActivity**  
   - Contient un `ViewPager2` pour la navigation entre les trois fragments.

2. **Fragments**  
   - **Fragment 1 - Présentation** : Titre et paragraphe d'introduction.
   - **Fragment 2 - Liste** : Liste de 5 éléments affichée à l'aide d'un `RecyclerView`.
   - **Fragment 3 - Présentation avec image** : Image en haut de l'écran avec un texte en dessous.

## Installation

1. Clonez le projet à partir de GitHub :
    ```bash
    git clone https://github.com/NezarElAyachi/ViewPager2App.git
    ```
   
2. Ouvrez le projet dans Android Studio.

3. Compilez et exécutez l'application sur un émulateur ou un appareil Android physique.

## Utilisation

- Faites glisser vers la gauche ou la droite pour naviguer entre les trois fragments.
- Le premier fragment vous présente l'application, le second montre une liste, et le troisième affiche une image avec du texte explicatif.

## Technologies utilisées

- **Kotlin** : Langage de programmation.
- **Android SDK** : Plateforme pour le développement d'applications Android.
- **ViewPager2** : Pour la navigation entre fragments.
- **RecyclerView** : Pour afficher une liste dans le deuxième fragment.

## Auteur

Développé par [NezarElAyachi](https://github.com/NezarElAyachi).

## License

Ce projet est sous licence MIT. Veuillez consulter le fichier LICENSE pour plus de détails.

##icon des lists pays

![Application Screenshot](app/src/main/res/drawable/drawable-mdpi/belgium.png)
![Application Screenshot](app/src/main/res/drawable/drawable-mdpi/canada.png)
![Application Screenshot](app/src/main/res/drawable/drawable-mdpi/france.png)
![Application Screenshot](app/src/main/res/drawable/drawable-mdpi/italy.png)
![Application Screenshot](app/src/main/res/drawable/drawable-mdpi/morocco.png)


##Application Screenshot


<img src="https://github.com/user-attachments/assets/9f7d028e-1679-4b3b-8325-309a9561b64a" alt="Screenshot 1" width="300"/>
<img src="https://github.com/user-attachments/assets/1416d7ec-1ad7-4832-803a-53d8bd608249" alt="Screenshot 2" width="300"/>
<img src="https://github.com/user-attachments/assets/8689f3fc-2ad5-4302-b3f8-5229a89ba878" alt="Screenshot 3" width="300"/>

