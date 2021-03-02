import React, { Component } from 'react'
// import {View,Text} from 'react-native'
import {styles} from './styles';
import Loader from '../../components/Loader'
import {FlatList,Image, ScrollView,TouchableOpacity, View, Text, StatusBar, ToastAndroid} from 'react-native';
export default class tab1 extends Component {
    constructor() {
          super();
          this.state = {
            d:[],
            isloading:true
              
            
          };
        }
        componentDidMount(){
          this.apicall()
        }
        async apicall(){
          let resp=await fetch('https://api.themoviedb.org/3/movie/popular?api_key=2f5f4b92c5bf9a11b168797aa7a7491b&language=en-US&page=1')
          let r= await resp.json()
          this.setState({
            d:r.results,
            isloading:false
          })
        }
        
        renderItem = ({item})=>{
          return(
          <TouchableOpacity style={styles.card}
          onPress={()=>{
            ToastAndroid.show(item.title,ToastAndroid.SHORT)
            console.log('navigating:'+item.id.toString());
            this.props.navigation.push('Card',{'Mid':item.id})
          }}
          > 
            <Image style={styles.image}
            source={{uri:'https://image.tmdb.org/t/p/w200/'+item.poster_path}}
            />
            <View style={{flex:1,justifyContent:'center',marginLeft:5}}>
              <Text style={styles.title}>
                Title: {item.title}
              </Text>
              <Text style={styles.overview}>
                Overview: {item.overview}
              </Text>
              <Text style={styles.rating}>
                Rating: {item.vote_average}/10 &nbsp;({item.vote_count} votes)
              </Text>
            </View>
          </TouchableOpacity>
          )
        }
        renderSeperator=()=>{
          return(
            <View
            style={{height:1,width:'100%',backgroundColor:'black'}}
            >
      
            </View>
          )
        }
        // creatHomeStack =()=>{
        //   <Stack.Navigator>
        //     <Stack.Screen name="Home" component={Home}/>
        //     <Stack.Screen name="ReviewDetails" component={ReviewDetails}/>
        //   </Stack.Navigator>
        // }
    render() {
        const {d,isloading}=this.state
        return (
            isloading
            ?
            <View style={{flex:1,justifyContent:'center'}}>
            <Loader></Loader>
            </View>
            :
            <>
            <View>
                    <Text style={{fontSize:27, fontWeight:'500',textAlign:'center', backgroundColor: '#000359', color: '#FFFFFF',paddingVertical:10}}>Popular</Text>
                </View>
            <View style={styles.container}>
            <FlatList
                data={d}
                renderItem={this.renderItem}
                keyExtractor={(item,i)=>i.toString()}
                ItemSeparatorComponent={this.renderSeperator}
            />
            </View>
            </>
        )
    }
}
