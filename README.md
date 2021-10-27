# clean-architecture example

Rick And Morty API</br>

Usando la API de Rick And Morty</br>
https://rickandmortyapi.com/documentation/#get-a-single-character</br>
https://rickandmortyapi.com/documentation/#get-a-single-location</br>

Exponer un endpoint que permita realizar una petición con el id de algún personaje de la serie</br>
Por ejemplo si consultamos por el id 1 , nos quedaria algo asi</br>
{</br>
 &nbsp;&nbsp;&nbsp;&nbsp;"id": 1,</br>
 &nbsp;&nbsp;&nbsp;&nbsp;"name": "Rick Sanchez",</br>
 &nbsp;&nbsp;&nbsp;&nbsp;"status": "Alive",</br>
 &nbsp;&nbsp;&nbsp;&nbsp;"species": "Human",</br>
 &nbsp;&nbsp;&nbsp;&nbsp;"type": "",</br>
 &nbsp;&nbsp;&nbsp;&nbsp;"episode_count": 41,</br>
 &nbsp;&nbsp;&nbsp;&nbsp;"origin": {</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"name": "Earth (C-137)",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"url": "https://rickandmortyapi.com/api/location/1",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"dimension": "Dimension C-137",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"residents": [</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/38",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/45",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/71",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/82",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/83",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/92",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/112",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/114",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/116",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/117",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/120",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/127",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/155",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/169",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/175",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/179",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/186",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/201",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/216",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/239",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/271",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/302",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/303",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/338",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/343",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/356",</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;"https://rickandmortyapi.com/api/character/394"</br>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;]</br>
 &nbsp;&nbsp;&nbsp;&nbsp;}</br>
}</br>

