import React, { useState } from "react";

export const AddFriend = () =>{

    const [firstName,setFirstName] = useState("");
    const [lastName,setLastName] = useState("");
    const [age,setAge] = useState(0);
    const [descryption,setDescrytion] = useState("");
    const addNewFriend = (event) =>{
        event.preventDefault();
        event.stopPropagation();
        const newFriend ={
            firstName: firstName,
            lastName: lastName,
            age: age,
            descryption: descryption
        }

        const url = "http://localhost:8080/api/friends";
        fetch(url,{
            method: "Post",
            headers:{
                'Content-Type': "application/json"
            },
            body: JSON.stringify(newFriend)
        }).then(data => console.log(data))
    }

    return(
        <form>
            <label>
                Imie:
                <input type="text" name="firstName" value={firstName}
                onChange={
                    event=>setFirstName(event.target.value)

                }/>
            </label>
            <label>
                Nazwisko
                <input type="text" name="lastName" value={lastName}
                onChange={
                    event=>setLastName(event.target.value)

                }/>
            </label>
            <label>
                Wiek:
                <input type="number" name="age" value={age}
                onChange={
                    event=>setAge(event.target.value)

                }/>
            </label>
            <label>
                Opis:
                <input type="text" name="descryption" value={descryption}
                onChange={
                    event=>setDescrytion(event.target.value)

                }/>
            </label>
            <input type="submit" value="Dodaj" onClick={event => addNewFriend(event)}/>
        </form>
    )

}