import {Component} from "react";


export class ToDoComponent extends Component {
    constructor() {
        super();
        this.state = {
            list: [],
            item: ''
        }
    }

    handleChange = (event) => {
        this.setState(
            {item:event.target.value}
        )
    }
    handleAddItem = () => {
        if(this.state.item!=''){
            this.setState(
                {list:[...this.state.list,this.state.item]}
            )
            this.setState(
                {item:''}
            )
        }
    }

    render() {
        return(
        <div>
            <input onChange={(event => this.handleChange(event))} type="item" value={this.state.item}/>
            <button onClick={this.handleAddItem}>Add</button>
            <table>
                {this.state.list.map(item=>(
                    <tr>
                        <td>{item}</td>
                    </tr>
                ))}
            </table>
        </div>
        )
    }
}