import {Component} from "react";
// function App() {
//     return (
//         <AddComponent firstNumber={4} secondNumber={6} />
//     );
// }
// export default App;
class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            number: 0,
            color: 'black'
        };
    }
    componentDidMount(){
        setTimeout(()=>{
            this.setState({color: 'pink'});
        },5000);
    }


    increase = () => {
        this.setState({number: this.state.number + 1});
    };
    decrease = () => {
        this.setState({number: this.state.number - 1});
    };
    nhan=()=>{
        this.setState({number:this.state.number*2});
    };
    render() {
        return (
            <div style={{
                backgroundColor: this.state.color,
                paddingTop: 20,
                width: 400,
                height: 80,
                margin: 'auto',
            }}>
                <button onClick={this.decrease}>Decrease</button>
                <span style={{padding: 10}}>{this.state.number}</span>
                <button onClick={this.increase}  onDoubleClick={this.nhan}>Increase</button>

            </div>
        );
    }
}

export default App;