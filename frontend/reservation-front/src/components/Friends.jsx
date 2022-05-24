import React, { useEffect, useState } from "react";

export const Friends = () => {

    const [appState, setAppState] = useState({ friends: [] })

    useEffect( () => {
        const url = "http://localhost:8080/api/friends";
        fetch(url)
            .then(data => data.json())
            .then(response => setAppState({friends: response}));
    });
    
    const removeFriend = (event,id) =>{

        const url = "http://localhost:8080/api/friends/"+id;
        fetch(url, {
            method: "DELETE"
        }).then(data => console.log(data))
    }


    return(
        <>
        <table>
            <thread>
                <tr>
                    <th>Imie</th>
                    <th>Nazwisko</th>
                    <th>Wiek</th>
                    <th>Opis</th>
                </tr>
            </thread>
            <tbody>
                
        {appState.friends.map( (friend,index) =>{
            return(
                <tr key={index}>
                    <td>{friend.firstName}</td>
                    <td>{friend.lastName}</td>
                    <td>{friend.age}</td>
                    <td>{friend.descryption}</td>
                    <td><button onClick={event=>removeFriend(event,friend.id)}>Usuń</button></td>
                </tr>
            )
        })}
        </tbody>
        </table>
        </>
    )
}