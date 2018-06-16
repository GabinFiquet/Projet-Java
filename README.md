# Simon-Says

![Image d'un Simon Says](http://meesterwouter.weebly.com/uploads/4/2/3/3/42339249/4818014_orig.png)

En tant que projet de fin d'année, nous avons choisi de faire un Simon Says. Un jeu d'origine anglaise dont l'équivalent français le plus proche est "Jacques a dit". Les règles de ce jeu sont différentes du jeu de société "Jacques a dit" mais elles restent simples.  

## Les règles

Le jeu se présente sous la forme de quatre zones de couleurs qui sont très proches les unes des autres. Certaines de ces zones vont s'illuminer brièvement forment un motif. Le but du joueur est de répéter le motif indiqué par le jeu. Plus il réussit à retrouver le motif fabriqué par le jeu, plus les motifs deviennent durs à reproduire.  
  
 - Si au stade 1 : 5 couleurs s'illuminent tels que  :one: Rouge, Bleu, Vert, Bleu, Bleu
 - Au stade 2, on pourrait avoir quelque chose comme  :two: : Rouge, Bleu, Vert, Bleu, Bleu, Rouge, Jaune
 - Et au stade 3  :three: : Rouge, Bleu, vert, Bleu, Bleu, Rouge, Jaune, Vert, Vert
 
 Ces règles sont modulables. Parfois le même schéma est repris et d'autres fois non. Parfois il est incrémenté d'une couleur et d'autres fois plus.

## Les outils

Pour créer se projet, qui se rapproche d'un jeu vidéo mais extrèmement simplifié, nous avons décidé d'utiliser :

![Logo de Netbeans](https://dl2.macupdate.com/images/icons128/12078.png?d=1430771912) NetBeans en tant qu'environnement de travail       
  
![logo de Java](https://dynamicimagesfr-v2b.netdna-ssl.com/product_class_external_product/java_128.png) Et comme principale outil de réalisaton : Java FXML
  

NetBeans est le principale outils que nous avons utilisé en cour. Il permet de compiler, d'éxécuter et d'afficher son programme avec beaucoup d'aisence et dispose d'un détécteur / correcteur d'erreur très efficace.

Quant à JAVA FXML, c'est un outils que nous avons partiellement utilisé en cours. Cet outils nous permet de créer des éléments balisés un peu comme on le ferai sur une page web. Et puisqu'il s'agissait d'un jeu assez modeste, une lourde librairie de jeu vidéo n'était peut-être pas nécéssaire.

L'installation d'une application en JAVA FXML peut se faire en quelques clics sur NetBeans mais nécéssite certains type de fichier source pour pouvoir fonctionner.
  
  ![installer une application JAVA FXML](https://docs.oracle.com/javafx/scenebuilder/1/use_java_ides/img/nb-create-fxml-app.gif)
  
## Les objectifs

Pour être sur de mesurer correctement ses ambitions pour le projet, il fallait fixer des caps de réussite du projet. Ces caps correspondaient chacun à un différent niveau d'accomplissement du projet. L'idéal était bien sur d'arriver au dernier cap, le "hard cap" qui correspond au niveau de difficulté le plus ardu mais également le plus abouti de la tache.

- **Base cap** : faire fonctionner un Simon Says en mode console.

- **Soft cap** : faire fonctionner un niveau de Simon Says, sur une interface graphique avec un écran de réussite et un écran d'échec.
  
- **Mid cap** : faire fonctionner SimonsSays de manière récursive en augmentant la difficulté, avec un menu latéral d'options.
  
- **Hard cap** : faire un Simon Says plusieurs niveaux de difficulté, des motifs arythmiques et des effets sonores.

## La structure

La structure correspond à l'organisation des classes, des méthodes et la gestion de parenté et d'héritage pour chacun d'eux.

 :exclamation:  :exclamation:  :exclamation: Un incident inattendu est venue affecté le modèle de la structure créée pour le projet. Le poste sur lequel le schéma était stocké a été volé à l'UPMC, et avec lui la base du projet, ainsi que l'UML correspondant. Voilà pourquoi il est regrettable de ne pas pouvoir présenter d'UML au cours de ce rapport malgré la fin du projet.  :exclamation:  :exclamation:  :exclamation:

Cependant il faut savoir qu'une application JAVA FXML possède déjà de base une structure particulière et qu'il est difficile de s'en défaire pour la customiser à sa guise. On retrouvera donc souvent

- Un fichier GUI (xml) pour la vue,
- Un controller pour la gestion des événements et les méthodes,
- Un fichier main pour lancer le projet

JAVA FXML permet aussi de styliser la vue via le css. Il n'est donc pas rare de voir un fichier css.

Dans notre cas, notre projet regroupe les class cités ci-dessus :

 :paperclip: Une classe Main qui hérite d'Application
 
> Celle-ci sert uniquement à lancer le jeu et à charger les ressources. Elle contient la méthode start
 
 :paperclip: Une classe SimonSays
 
> Celle-ci contient tous les processus qui ont lieu lors du déroulement des séquences de jeu. Ce fichier a été           utilisé pour la création du projet en mode console. 
            
 :paperclip: Un fichier GUI
 
> Le seul élément du dossier source qui n'est pas un .java. Il contient des éléments XML qui possèdent leur propre nom et leurs propres attributs et peuvent être liés au fichier java à l'aide d'un id ou d'un gestionnaire d'event. C'est la dedans qu'ont été modélisés les carrés de couleurs et les boutons du menu latéral.
            
 :paperclip: Un fichier controller
 
> Ce fichier gère la gestion d'évènements des carrés de couleurs et des boutons. Ce sont des méthodes publiques qui sont appelées à des moments clés du jeu. Lancement de séquence, clic sur carré, demande de sortie...

## Les difficultés 

L'incident évoqué plus haut a été une grosse difficulté à gérer. Ajoutée à cela une gestion pas toujours exemplaire du planning et des phases de bugs ou le projet était mis en suspens.

Les tutoriels de JAVA FXML ne sont pas si nombreux et rarement en français d'ailleurs. La moindre action demande une longue période de recherche bien qu'au final elle soit simple à écrire.

D'un point de vue plus global, la gestion de la vue en lien avec le controller ou avec le SimonSays était la grosse difficulté du projet. Proposer une vue fixe est quelque chose d'assez simple à faire en XML. Faire une vue dynamique et interactive est d'un tout autre niveau.

## Le bilan

Ce projet a été tortueux et complexe a bien des égards :

Des séances de cours pour avancer davantage dessus nous faisaient défaut.
Un poste a disparu en route, et ses données avec.
De nombreux bugs sur des événements au clic pas toujours explicite.

Malgré cela, la réussite d'avoir atteint le mid cap du projet indique la bonne expérience que ce projet a été.

## Les améliorations 

Si ce projet était à refaire ou à peaufiner, on aimerai beaucoup atteindre le hard cap fixé initialement. Et aussi faire le style en css :  proposer plus de possibilités et une gestion des évènements beaucoup plus simple.
