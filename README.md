# Simon-Says

![Image d'un Simon Says](http://meesterwouter.weebly.com/uploads/4/2/3/3/42339249/4818014_orig.png)

En tant que projet de fin d'années, nous avons choisi de faire un Simon Says. Un jeu d'origine anglaise dont l'équivalent français le plus proche est << Jacques a dit >>. Les règles de ce jeu sont différentes du jeu de société << Jacques a dit >> mais elles restent simple.  

## Les règles

Le jeu se présente sous la forme de quatre zones de couleurs qui sont très proche les unes des autres. Certaines de ces zones vont s'illuminer brievement forment un motif. Le but du joueur est de répéter le motif indiqué par le jeu. Plus il réussi à retrouver le motif fabriqué par le jeu, plus les motifs deviennent dur à reproduire.  
  
 - Si au stade 1 : 5 couleurs s'illuminent tels que  :one: Rouge, Bleu, Vert, Bleu, Bleu
 - Au stade 2, on pourrait avoir quelque chose comme  :two: : Rouge, Bleu, Vert, Bleu, Bleu, Rouge, Jaune
 - Et au stade 3  :three: : Rouge, Bleu, vert, Bleu, Bleu, Rouge, Jaune, Vert, Vert
 
 Ces règles sont modulables. Parfois le même schéma est repris et d'autre fois non. Parfois il est incrémenté d'une couleur et d'autre fois plus.

## Les outils

Pour créer se projet, qui se rapproche d'un jeu vidéo mais extrèmement simplifié, nous avons décidé d'utiliser :

![Logo de Netbeans](https://dl2.macupdate.com/images/icons128/12078.png?d=1430771912) NetBeans en tant qu'environnement de travail       
  
![logo de Java](https://dynamicimagesfr-v2b.netdna-ssl.com/product_class_external_product/java_128.png) Et Comme principale outil de réalisaton : Java FXML
  

NetBeans est le principale outils que nous avons utilisé en cour. Il permet de compiler, d'éxécuter et d'afficher son programme avec beaucoup d'aisence et dispose d'un détécteur / correcteur d'erreur très efficace.

Quant à JAVA FXML, il se trouve que c'est un outils que nous avons partiellement utilisé en cours. Et le fait de pouvoir fabriquer la vue à l'aide d'un fichier xml et de positionner les éléments un peu comme on le ferait sur une page web; ce côté pratique de JAVA FXML nous a beaucoup influencé sur le choix de nos outils. Et puisqu'il s'agissait d'un jeu assez modeste, une lourde librairie de jeu vidéo n'était peut-être pas nécéssaire.

L'installation d'une application en JAVA FXML peut se faire en quelques clics sur NetBeans mais nécéssite certains type de fichier source pour pouvoir fonctionner.
  
  ![installer une application JAVA FXML](https://docs.oracle.com/javafx/scenebuilder/1/use_java_ides/img/nb-create-fxml-app.gif)
  
## Les objectifs

Pour être sur ne pas viser trop haut ou trop bas pour se projet, il fallait fixer des cap de réussite du projet. Ces cap correspondait chacun à un différent niveau d'accomplissement du projet. L'idéal étant bien sur d'arriver au dernier cap, le << hard cap >> qui correspond au niveau de difficulté le plus hardu mais également le plus abouti de la tache.

- **Base cap** : faire fonctionner un Simon Says en mode console

- **Soft cap** : faire fonctionner un niveau de Simon Says, sur une interface graphique avec un écran de réussite et un écran d'échec 
  
- **Mid cap** : faire fonctionner SimonsSays de manière récursive en augmentant la difficulté, avec un menu latéral d'option
  
- **Hard cap** : faire un Simon Says plusieurs niveaux de difficultés, des motifs arithmiques et des effets sonores.
